package mx.poo.itao.objetos;
import java.util.Scanner;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private String nombre;
    private int edad;
    private String estadoDeAnimo;
    private boolean gustaInstrumentos;
    private boolean prefiereBailar;
    private String horaDelDia;

    public void llamarUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cómo te llamas?");
        setNombre(sc.nextLine());
        System.out.println("¿Cuántos años tienes? FAVOR DE ESCRIBIR EN VALOR NUMERICO" );
        setEdad(sc.nextInt()); sc.nextLine();
        System.out.println("¿Cómo te sientes hoy? (Feliz / Triste / Enérgico / Relajado)");
        setEstadoDeAnimo(sc.nextLine());
        System.out.println("¿Te gusta la música con instrumentos? (1. Sí / 2. No)");
        setGustaInstrumentos(sc.nextInt() == 1); sc.nextLine();
        System.out.println("¿Prefieres música para bailar? (1. Sí / 2. No)");
        setPrefiereBailar(sc.nextInt() == 1); sc.nextLine();
        System.out.println("¿En qué momento del día escuchas más música? (Mañana / Tarde / Noche)");
        setHoraDelDia(sc.nextLine());
    }
}