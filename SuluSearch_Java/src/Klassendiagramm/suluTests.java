/**

 * 
 */
package Klassendiagramm;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.*;
import org.junit.Test;

/**
 * 
 * @author Team7
 *
 */

public class suluTests {
	Artikel art1 = new Artikel(new File("./bible/bible_part1.txt"), "./bible/bible_part1.txt");
	static Archiv arch1 = new Archiv(new File("./bible"), "./bible");
	static Suchwort sw = new Suchwort("cinnamon");
	static SuluSearch s;
	static int hits = 0;

	//bestanden
	@Test
	public void verifyLanguageTest() {
		s = new SuluSearch();
		s.changeLanguage();
		assertTrue(s.closeButton.getLabel().equals("Close") && s.searchButton.getLabel().equals("Search"));
	}

	//bestanden
	  @Test 
	  public void searchFileTest() { 
		  s = new SuluSearch(); 
		  hits = s.search(art1, sw); 
		  assertTrue(hits == 2); 
		  }
	 

	
	  //	Der Archivtest wurde obsolet, da das duechsuchen eines Archivs durch das
	  //    wiederholte aufrufen der Artikel-Suchfunktion erfolgt, welche bereits er-
	  //	folgreich getestet wurde.
	 

}
