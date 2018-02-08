package suivisportif;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class QuestionnaireTest {

  @Test
  public void testQuestionnaire() {
    fail("Not yet implemented");
  }

  @Test
  public void testGetTitre() {
    @SuppressWarnings("deprecation")
    Date d = new Date(2000, 01, 21);
    
    @SuppressWarnings("deprecation")
    Date f = new Date(2001, 01, 21);
    
    Questionnaire q = new Questionnaire(d, f);
    
    String t = new String();
    
    assertTrue("Titre non trouv�", t.equals(q.getTitre()) == true);
    
    q.setTitre("Coucou");
    t = q.getTitre();
    assertEquals("Titre trouv�", true, t.equals("Coucou"));
  }

  @Test
  public void testSetTitre() {
    @SuppressWarnings("deprecation")
    Date d = new Date(2000, 01, 21);
    
    @SuppressWarnings("deprecation")
    Date f = new Date(2001, 01, 21);
    
    Questionnaire q = new Questionnaire(d, f);
    
    q.setTitre("Coucou");
    String tres = q.getTitre();
    assertEquals("Titre trouv�", true, tres.equals("Coucou"));
  }

  @Test
  public void testGetSstitre() {
    @SuppressWarnings("deprecation")
    Date d = new Date(2000, 01, 21);
    
    @SuppressWarnings("deprecation")
    Date f = new Date(2001, 01, 21);
    
    Questionnaire q = new Questionnaire(d, f);
    
    String t = new String();
    
    assertTrue("Titre non trouv�", t.equals(q.getSstitre()) == true);
    
    q.setSstitre("Coucou");
    t = q.getSstitre();
    assertEquals("Titre trouv�", true, t.equals("Coucou"));
  }

  @Test
  public void testSetSstitre() {
    @SuppressWarnings("deprecation")
    Date d = new Date(2000, 01, 21);
    
    @SuppressWarnings("deprecation")
    Date f = new Date(2001, 01, 21);
    
    Questionnaire q = new Questionnaire(d, f);
    
    q.setSstitre("Coucou");
    String tres = q.getSstitre();
    assertEquals("Titre trouv�", true, tres.equals("Coucou"));
  }

  @Test
  public void testGetDateD() {
    @SuppressWarnings("deprecation")
    Date d = new Date(2001 - 1900, 1, 21);
    
    @SuppressWarnings("deprecation")
    Date f = new Date(2001 - 1900, 1, 21);
    
    Questionnaire q = new Questionnaire(d, f);
    
    SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");  
    String strDate = formatter.format(q.getDateD());  
    System.out.println("Date Format with dd MMMM yyyy : " + strDate);
    
    assertFalse("Date non conforme.", d.equals(q.getDateD()) == false);
  }

  @Test
  public void testSetDateD() {
    fail("Not yet implemented");
  }

  @Test
  public void testGetDateF() {
    fail("Not yet implemented");
  }

  @Test
  public void testSetDateF() {
    fail("Not yet implemented");
  }

  @Test
  public void testGetMessageFin() {
    fail("Not yet implemented");
  }

  @Test
  public void testSetMessageFin() {
    fail("Not yet implemented");
  }

  @Test
  public void testGetquListe() {
    fail("Not yet implemented");
  }

  @Test
  public void testSetqListe() {
    fail("Not yet implemented");
  }

  @Test
  public void testAddQuestion() {
    fail("Not yet implemented");
  }

  @Test
  public void testObject() {
    fail("Not yet implemented");
  }

  @Test
  public void testGetClass() {
    fail("Not yet implemented");
  }

  @Test
  public void testHashCode() {
    fail("Not yet implemented");
  }

  @Test
  public void testEquals() {
    fail("Not yet implemented");
  }

  @Test
  public void testClone() {
    fail("Not yet implemented");
  }

  @Test
  public void testToString() {
    fail("Not yet implemented");
  }

  @Test
  public void testNotify() {
    fail("Not yet implemented");
  }

  @Test
  public void testNotifyAll() {
    fail("Not yet implemented");
  }

  @Test
  public void testWaitLong() {
    fail("Not yet implemented");
  }

  @Test
  public void testWaitLongInt() {
    fail("Not yet implemented");
  }

  @Test
  public void testWait() {
    fail("Not yet implemented");
  }

  @Test
  public void testFinalize() {
    fail("Not yet implemented");
  }

}