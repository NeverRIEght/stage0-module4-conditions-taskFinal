package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        String seasonName = switch (monthNumber) {
            case 1, 2, 12 -> {
                yield "Winter";
            }
            case 3, 4, 5 -> {
                yield "Spring";
            }
            case 6, 7, 8 -> {
                yield "Summer";
            }
            case 9, 10, 11 -> {
                yield "Autumn";
            }
            default -> {
                yield "Wrong month number";
            }
        };

        System.out.println(seasonName);
    }
}
