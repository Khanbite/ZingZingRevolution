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

    public String remixRoutine() {
        String base = buildRoutine();
        StringBuilder remixed = new StringBuilder("--- REMIX ---\n");
        remixed.append(base);
        if (remixed.charAt(remixed.length() - 1) == '\n') {
            remixed.delete(remixed.length() - 1, remixed.length());
        }
        remixed.reverse();
        remixed.append("\n(Backwards Boohbah Shuffle!)");
        return remixed.toString();
}
}
