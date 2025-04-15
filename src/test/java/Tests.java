import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.finalproject.finalproject.db.texts;
import org.finalproject.finalproject.servlets.FirstQuestion;
import org.finalproject.finalproject.servlets.SecondQuestion;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class Tests {
    @Test
    public void testFirst(){
        FirstQuestion firstQuestion = new FirstQuestion();
        firstQuestion.destroy();
    }
    @Test
    public void testSecond(){
        SecondQuestion secondQuestion = new SecondQuestion();
    }
    @Test
    public void testIndex(){
        texts.GameCount++;
    }
    @Test
    public void MockTestFirstServlet() throws Exception{
        FirstQuestion mock = Mockito.mock(FirstQuestion.class);
        mock.doGet(Mockito.mock(HttpServletRequest.class),Mockito.mock(HttpServletResponse.class));
    }
    @Test
    public void MockTestSecondServlet() throws Exception{
        SecondQuestion mock = Mockito.mock(SecondQuestion.class);
        mock.doGet(Mockito.mock(HttpServletRequest.class),Mockito.mock(HttpServletResponse.class));
    }
    @Test
    public void MockTestThirdServlet() throws Exception{
        FirstQuestion mock = Mockito.mock(FirstQuestion.class);
        mock.doGet(Mockito.mock(HttpServletRequest.class),Mockito.mock(HttpServletResponse.class));
    }

}
