import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.Assert.assertEquals;
import java.util.stream.Stream;

class CardGameTest{

@ParameterizedTest
@MethodSource({"provideStringsArray"})
  void AdamWinsArray(String [] deckAdam,String [] deckMati,String wynik) {

   assertEquals(wynik, CardGame.winner(deckAdam, deckMati));
  }
 
  private static Stream<Arguments> provideStringsArray() {
    return Stream.of(
      Arguments.of(new String[]{"K","J","A"},new String[]{"8","7","6"},"Adam wygrywa 3 do 0"),
      Arguments.of(new String[]{"K","J","2"},new String[]{"8","7","6"},"Adam wygrywa 2 do 1"),
      Arguments.of(new String[]{"K","J","A"},new String[]{"K","J","A"},"Remis"),
      Arguments.of(new String[]{"8","7","6"},new String[]{"K","J","2"},"Mati wygrywa 2 do 1"),
      Arguments.of(new String[]{"8","7","6"},new String[]{"K","J","A"},"Mati wygrywa 3 do 0")
    );
  }

}
