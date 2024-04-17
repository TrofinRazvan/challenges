package challenges.oop.polymorphism.two;

import java.time.LocalDate;

public class ConstructionProgress {

    private LocalDate startDate;
    private LocalDate endDate;
    private double completionPercentage;
    private String currentPhase;

    public ConstructionProgress(LocalDate startDate, LocalDate endDate, double completionPercentage, String currentPhase) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.completionPercentage = completionPercentage;
        this.currentPhase = currentPhase;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getCompletionPercentage() {
        return completionPercentage;
    }

    public void setCompletionPercentage(double completionPercentage) {
        this.completionPercentage = completionPercentage;
    }

    public String getCurrentPhase() {
        return currentPhase;
    }

    public void setCurrentPhase(String currentPhase) {
        this.currentPhase = currentPhase;
    }
}