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
public class Rock extends GeneroMusical {

    public void llamarRock() {
        setNombre("Rock");
        setAmbiente("Concierto / Relajado");
        setRitmo("Medio");
        setEnergia("Media a Alta");
        setPopularidad("Alta");
    }

    public void mostrarInfo() {
        System.out.println("🎸 Género: " + getNombre());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Ritmo: " + getRitmo());
        System.out.println("Energía: " + getEnergia());
        System.out.println("Popularidad: " + getPopularidad());
    }
}