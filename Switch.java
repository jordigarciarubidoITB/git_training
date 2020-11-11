import java.util.Scanner;

public class Switch{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introdueix quin color es el teu preferit per veure una petita explicacio sobre ell:");
                System.out.println("------------------------------------------");
		String color = scanner.next();
                System.out.println("------------------------------------------");

		switch(color){
			case "Verd":
				System.out.println("El verd és un dels tres colors primaris additius. És un dels colors que millor percep l'ull, els fluorescents (prop de 600 nanòmetres) són els que més ressalten a la vista i és més sensible a l'ull, d'aquí la raó per la qual la seva visió prolongada molesti la visió. El verd és un color freqüent en la naturalesa.");
				break;
			case "Vermell":
				System.out.println("El roig o vermell és el color amb la freqüència més baixa de llum que pot discernir l'ull humà. Quan la llum té una freqüència menor que la del roig, es diu que és infraroja. El color roig és un color primari de llum, juntament amb el blau i el verd.");
				break;
                        case "Blau":
                                System.out.println("El blau (del germànic blau) és una variació del color cian dels tres colors primaris additius. Es considera un color fred i oposat al taronja. Tonalitats del blau són el blau cel, el blau marí, l'atzur, l'anyil, el cobalt, el cian, el blau elèctric, el blau de Prússia, l'indi o el ceruli.");
                                break;
                        case "Blanc":
                                System.out.println("El color blanc neix de la composició de tots els altres colors. Aquest fet va ser descobert per Isaac Newton quan al fer passar llum blanca per un prisma va veure com es descomponia en els diferents colors que la componen. A aquest fenomen s'anomena dispersió.");
                                break;
                        case "Groc":
                                System.out.println("El groc és el complement del blau, i com a tal, els pigments grocs absorbeixen la llum blava. La paraula prové del llatí crocus, «safrà» que al seu torn prové de la figura de la mitologia grega Κρόκος. El groc és també un dels pigments primaris. Hi ha diferents tonalitats de groc com ara: or, or vell, groc daurat, llimona, mostassa i caqui.");
                                break;
                        case "Taronja":
                                System.out.println("El color taronja o carabassa té una longitud d'ona d'entre 620 i 585 nm, està entre el roig i el groc. El seu nom ve del cítric, encara que en alguns dialectes se l'anomena vermell o -com en el cas del valencià- carabassa. El seu color complementari és el blau.");
                                break;
                        case "Lila":
                                System.out.println("El lila és un color semblant al violeta però més pàl·lid, propi de les flors de lavanda o la Syringa vulgaris, la planta que li dóna nom. És complementari al to de l'oliva o proper a determinades tonalitats de rosa o magenta. El codi de teclat per mostrar-lo en pantalla és el (Hex: #C8A2C8)");
                                break;
                        case "Negre":
                                System.out.println("El negre és un color pur que indica l'absència de color o de llum. El negre és la percepció visual de màxima foscor, per mor de la inexistència de foto-recepció, no per causa biològica sinó per absència total de flux lluminós, o bé per una intensitat de fluix per sota del llindar de percepció. Hom pot dir que el negre és el color més fosc.");
                                break;
			default:
				System.out.println("Color no disponible");

		}

	}
}
