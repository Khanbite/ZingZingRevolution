public class BoohbahDanceTest {
    public static void main(String[] args) {
        Boohbah one = new Boohbah("Zing Zing Zingbah", "Spin and Sparkle");
        Boohbah two = new Boohbah("Humbah", "Wiggle Wiggle");
        Boohbah three = new Boohbah("Jumbah", "Twirl of Joy");

        Boohbah[] team = {one, two, three};

        DanceRoutine routine = new DanceRoutine(team);

        System.out.println("Original: ");
        System.out.print(routine.buildRoutine());

        System.out.println("Modified: ");
        System.out.print(routine.modifyRoutine());

        System.out.println("Remixed Routine:");
        System.out.print(routine.remixRoutine());
    }
}

