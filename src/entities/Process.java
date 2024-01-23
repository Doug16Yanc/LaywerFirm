package entities;

import enumerations.ProcessSituation;

import java.time.LocalDateTime;

public class Process {
    private Long codeProcess;
    private LocalDateTime apertureProcess;
    private LocalDateTime conclusionProcess;
    private String descriptionProcess;
    private ProcessSituation processSituation;

    public Process(){

    }
    public Process(Long codeProcess, LocalDateTime apertureProcess, LocalDateTime conclusionProcess, String descriptionProcess, ProcessSituation processSituation){
        this.codeProcess = codeProcess;
        this.apertureProcess = apertureProcess;
        this.conclusionProcess = conclusionProcess;
        this.descriptionProcess = descriptionProcess;
        this.processSituation = processSituation;
    }


    public Long getCodeProcess() {
        return codeProcess;
    }

    public void setCodeProcess(Long codeProcess) {
        this.codeProcess = codeProcess;
    }

    public LocalDateTime getApertureProcess() {
        return apertureProcess;
    }

    public void setApertureProcess(LocalDateTime apertureProcess) {
        this.apertureProcess = apertureProcess;
    }

    public LocalDateTime getConclusionProcess() {
        return conclusionProcess;
    }

    public void setConclusionProcess(LocalDateTime conclusionProcess) {
        this.conclusionProcess = conclusionProcess;
    }

    public String getDescriptionProcess() {
        return descriptionProcess;
    }

    public void setDescriptionProcess(String descriptionProcess) {
        this.descriptionProcess = descriptionProcess;
    }

    public ProcessSituation getProcessSituation() {
        return processSituation;
    }

    public void setProcessSituation(ProcessSituation processSituation) {
        this.processSituation = processSituation;
    }
}
