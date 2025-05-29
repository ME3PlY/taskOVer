package Model;

public enum UrgencyLevel {
    LOW, MEDIUM, HIGH;

    public static UrgencyLevel fromInt(int level) {
    	switch (level) {
            case 1: return LOW;
            case 2: return MEDIUM;
            case 3: return HIGH;
            default: throw new IllegalArgumentException("Invalid urgency level");
        }
    }

    @Override
    public String toString() {
        switch (this) {
            case LOW: return "Low";
            case MEDIUM: return "Medium";
            case HIGH: return "High";
            default: return "";
        }
    }
}