package services;

import entities.Process;
import enumerations.ProcessSituation;
import repositories.GenerationImplementation;


import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import static utilities.Utility.println;
import static utilities.Utility.sc;

public class ServiceProcess {

    private static final Map<Process, Long> processes = new HashMap<>();

    public static int recordProcess(){
        println("Process record");
        System.out.println("Do a description about this process:");
        String description = sc.nextLine();

        Long idProcess = (long) GenerationImplementation.generateIdProcess();

        LocalDateTime NowData = LocalDateTime.now();

        ProcessSituation processSituation = ProcessSituation.Open;
        Process process = new Process(idProcess, NowData, LocalDateTime.MAX, description, processSituation);

        processes.put(process, idProcess);

        return Math.toIntExact(idProcess);
    }
    public static int queryProcess(){
        println("Enter process code:\n");
        System.out.println("Code:");
        Long code = sc.nextLong();

        if(processes.containsKey(code)){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static int updateProcess(){
        println("Process updates");
        return 1;
    }
    public static void listProcess(Process process){
        for (Process entry : processes.keySet()){
            println(String.format("Process\n" +
                    " > Code process : " + process.getCodeProcess() + "\n" +
                    " >  Aperture process : " + process.getApertureProcess() + "\n" +
                    " >  Conclusion process : " + process.getConclusionProcess() + "\n" +
                    " >  Description process : " + process.getDescriptionProcess() + "\n" +
                    " >  Situation process : " + process.getProcessSituation()));
        }
    }
}