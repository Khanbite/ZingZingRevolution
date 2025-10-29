public class DanceRoutine {
    private Boohbah[] boohbahs;

    public DanceRoutine(Boohbah[] boohbahs) {
        this.boohbahs = boohbahs;
    }

    public String buildRoutine() {
        StringBuilder routine = new StringBuilder();
        for (Boohbah b : boohbahs) {
            routine.append(b.performMove()).append("\n");
        }
        return routine.toString();
    }

    public String modifyRoutine() {
        StringBuilder modify = new StringBuilder();
        for (Boohbah b : boohbahs) {
            String line = b.performMove().replace("performs", "dances to");
            modify.append(line).append("\n");
        }
        return modify.toString();
    }
}
