package mx.poo.itao.objetos;
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
public class GeneroMusical {
    private String nombre;
    private String ambiente;
    private String ritmo;
    private String energia;
    private String popularidad;
    public void mostrarInfoGenero() {
        System.out.println("🎸 Género: Rock");
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Ritmo: " + getRitmo());
        System.out.println("Energía: " + getEnergia());
        System.out.println("Popularidad: " + getPopularidad());
        System.out.println("Nombre: " + getNombre());
    }
}