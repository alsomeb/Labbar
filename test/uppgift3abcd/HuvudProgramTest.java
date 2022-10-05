package uppgift3abcd;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HuvudProgramTest {
    Course java = new Course("Java");
    Course net = new Course(".NET");
    List<Participation> testList = new ArrayList<>(List.of(
            new Participation(new Student("Alex"), java),
            new Participation(new Student("Andreas"), java),
            new Participation(new Student("Sasha"), net),
            new Participation(new Student("Testare"), net)
    ));
    HuvudProgram h = new HuvudProgram();

    @Test
    void testGetListOfParticipantsByCourseReturnsCorrect() {
        java.setTeacher(new Teacher("Sigrun"));

        int expectedCount = 2;
        int actualCount = h.getListOfParticipantsByCourse(java, testList).size();
        List<Participation> actualParticipationList = h.getListOfParticipantsByCourse(java, testList);

        assertEquals(expectedCount, actualCount);

        // Vi loopar igenom listan och kollar att Kursen Java finns på varenda Kurs i Listan som spottas ut samt att läraren är Sigrun.
        // Sedan har vi lagt in andra Participants i huvudlistan så dessa skall ju inte komma med här
        // Då kan vi var säkra på att metoden funkar som det skall
        actualParticipationList.forEach(participation -> {
            assertSame(java, participation.getCourse());
            assertNotSame(net, participation.getCourse());
            assertSame("Sigrun", participation.getCourse().getTeacher().getName());
            assertNotSame("Alex", participation.getCourse().getTeacher().getName());
        });


    }
}