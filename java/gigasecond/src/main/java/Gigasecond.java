import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    LocalDateTime localDateTime;

    Gigasecond(LocalDate birthDate) {
        localDateTime = birthDate.atStartOfDay().plusSeconds(1000000000);
    }


    Gigasecond(LocalDateTime birthDateTime) {
       localDateTime = birthDateTime.plusSeconds(1000000000);
    }

    LocalDateTime getDate() {
        return localDateTime;
    }
}
