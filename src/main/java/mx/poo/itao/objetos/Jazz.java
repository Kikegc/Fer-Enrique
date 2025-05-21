package mx.poo.itao.objetos;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Jazz extends GeneroMusical {

    public void llamarJazz() {
        setNombre("Jazz");
        setAmbiente("Café / Relajado");
        setRitmo("Medio");
        setEnergia("Media");
        setPopularidad("Media");
    }

    public void mostrarInfo() {
        System.out.println("🎷 Género: " + getNombre());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Ritmo: " + getRitmo());
        System.out.println("Energía: " + getEnergia());
        System.out.println("Popularidad: " + getPopularidad());
    }
}
