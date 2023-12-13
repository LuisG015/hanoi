public class TorreHanoi {
    public int resolverTorreHanoi(int discos){
        if (discos < 0) {
            throw new IllegalArgumentException("Número de discos não pode ser negativo");
        }
        return (int)(Math.pow(2, discos)-1);
    }
}
