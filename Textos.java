import java.io.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

class Textos {
  public static void get2002() throws IOException, MalformedURLException {

    URL url = new URL("https://textdoc.co/R8BdwPNDHiKFCL6O");
    Scanner read = new Scanner(url.openStream());
    BufferedWriter writer = new BufferedWriter(new FileWriter("2002.txt"));
    while(read.hasNext()){
      writer.write(read.nextLine());
    }  
    writer.close();
    
    String texto = "1 de Enero  Entra en circulación el euro como moneda única en 12 países de Europa. (Hace 20 años)5 de Enero  Un grupo de investigadores japoneses logra crear un ojo artificial por primera vez en el mundo, implantando globos oculares a renacuajos extraídos de embriones de ranas. Una semana después, se confirmará que no hay síntomas de rechazo. (Hace 20 años)28 de Febrero Hoy es el día en que desaparecen definitivamente las monedas nacionales de doce países de la UE, por lo que, a partir de mañana, el euro se convertirá en todos ellos como la única divisa de curso legal, tras haberse puesto en circulación el 1 de enero de este mismo año y haber coexistido con las divisas nacionales durante 59 días. Las antiguas monedas nacionales se podrán canjear por euros indefinidamente. (Hace 20 años)13 de Abril En Venezuela fracasa el golpe de Estado militar, que el día anterior ha colocado al empresario Pedro Carmona Estanga como presidente interino del país, restableciendo al depuesto Hugo Chávez en la presidencia. (Hace 20 años)31 de Mayo Da comienzo el mundial de fútbol disputado en Corea del Sur y Japón que vería a Brasil coronarse campeón del mundo por quinta vez en toda la historia. (Hace 20 años)30 de Julio En Pretoria (Sudáfrica), los presidentes de la República Democrática del Congo, Joseph Kabila, y de Ruanda, Paul Kagame, firman un acuerdo de paz que pone fin a cuatro años de guerra, con un trágico balance de tres millones y medio de muertos. Inmediatamente, se empezará a verificar la retirada de las tropas ruandesas estacionadas desde 1998 en el territorio congoleño. (Hace 19 años)10 de Septiembre Suiza, país tradicionalmente neutral y una de las democracias más antiguas del mundo, se une a las Naciones Unidas pasando de observador a miembro de pleno derecho. (Hace 19 años)27 de Octubre En Brasil, el político de izquierdas Lula da Silva es elegido presidente. Gobernará desde el 1 de enero de 2003 al 1 de enero de 2011. Su mandato se caracterizará por los buenos resultados económicos. (Hace 19 años)21 de Noviembre La Organización del Tratado del Atlántico Norte (OTAN), en su reunión de la cumbre de Praga, cursa una invitación oficial para que Bulgaria, Eslovaquia, Eslovenia, Estonia, Letonia, Lituania y Rumanía se conviertan en nuevos miembros de esta alianza internacional, política y militar. (Hace 19 años)";
  Path file = Path.of("2002.txt");
  String fileToText = Files.readString(file);
  if(fileToText.contains(texto)){
    System.out.println(texto);
    }
  }

  public static void getCelular()throws IOException, MalformedURLException{
    URL url = new URL("https://textdoc.co/fEZywYWAJDPrmIzQ");
    Scanner read = new Scanner(url.openStream());
    BufferedWriter writer = new BufferedWriter(new FileWriter("celular.txt"));
    while(read.hasNext()){
      writer.write(read.nextLine());
    }  
    writer.close();

    String texto = "1 - La telefonía móvil o telefonía celular es un medio de comunicación inalámbrico a través de ondas electromagnéticas. Como cliente de este tipo de redes, se utiliza un dispositivo denominado «teléfono móvil», «teléfono celular» o «móvil». 2 - El teléfono es un aparato destinado a la transmisión de información sonora por medio de la recepción, transformación y emisión de impulsos eléctricos. 3 - Un móvil es un teléfono portátil desde el que se puede llamar , jugar , sirve para hablar por mensaje. Es cuadrado o rectangular , pesa muy poco y es frágil . Tiene la pantalla de cristal ,se hacen fotos y grabaciones. Es liso, te puedes bajar aplicaciones, puedes poner fondos de pantalla y puedes escuchar música. 4 - El Samsung Galaxy A52 5G es actualmente el mejor celular que puedes obtener por menos de $500 dólares. Con un diseño moderno, buen rendimiento y una cámara versátil y de alta calidad, este teléfono supera su categoría para un dispositivo de su rango de precio. 5 - El ZTE Axon 30 Ultra está a punto de convertirse en el smartphone con más capacidad de memoria de la historia.";
  Path file = Path.of("celular.txt");
  String fileToText = Files.readString(file);
  if(fileToText.contains(texto)){
    System.out.println(texto);
    } 
  }

public static void getUcrania()throws IOException, MalformedURLException{
    URL url = new URL("https://textdoc.co/2DBhs8do7PfeAECp");
    Scanner read = new Scanner(url.openStream());
    BufferedWriter writer = new BufferedWriter(new FileWriter("guerra ucrania.txt"));
    while(read.hasNext()){
      writer.write(read.nextLine());
    }  
    writer.close();

    String texto = "1. La guerra en Ucrania cumple este martes 97 días y la ofensiva rusa se concentra en la región del Donbás, en el este del país. La situación es especialmente dura en Severodonetsk, una ciudad clave para el control ruso de Lugansk y controlada en parte por las tropas invasoras. 2. El periodista de la cadena francesa BFMTV Frédéric Leclerc-Imhoff fue asesinado este el lunes mientras informaba sobre un convoy humanitario en la región de Lugansk, en el Donbass, al este ucraniano. Mientras París solicitó una investigación transparente lo antes posible para arrojar luz sobre las circunstancias de esta tragedia 3. En la cumbre de la Unión Europea se abordaron temas como la posible crisis alimentaria que se puede avecinar y las pruebas de los bloqueos que Rusia está haciendo para evitar las exportaciones de trigo. La reunión termina con nuevas sanciones que podrían aumentar los precios a todos los países europeos, aún así se iniciará un embargo gradual de petróleo. 4. Conocida como el granero de Europa, Ucrania depende en gran medida de su producción y exportaciones agrícolas. Pero los ataques rusos deliberados contra granjas e instalaciones de almacenamiento de alimentos están sirviendo para reducir aún más la capacidad del país para dar de comer a su gente y hacer avanzar su economía. 5. La Cámara Alta estadounidense dio luz verde definitiva a una ayuda extra para Ucrania que servirá para armas y mitigar la crisis generada por la guerra. Por otro lado, Vadim Shishimarin, el primer militar ruso acusado de crímenes de guerra, se enfrenta a una sentencia de cárcel de por vida, si es aceptada la petición de los fiscales ucranianos. Previamente, el soldado admitió su responsabilidad y pidió perdón.";
  Path file = Path.of("guerra ucrania.txt");
  String fileToText = Files.readString(file);
  if(fileToText.contains(texto)){
    System.out.println(texto);
  
    }
  }
}
