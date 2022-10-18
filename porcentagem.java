public class porcentagem {
    public static void main(String[] args) {
        
        double sp = 67.83643;
        double rj = 36.67866;
        double mg = 29.22988;
        double es = 27.16548;
        double ou = 19.84953;
        double total = (sp + rj + mg + es + ou);
        System.out.println(total);
        
        System.out.println("Porcentagem de SP: " + sp*100/total + "%");
        System.out.println("Porcentagem de RJ: " + rj*100/total + "%");
        System.out.println("Porcentagem de MG: " + mg*100/total + "%");
        System.out.println("Porcentagem de ES: " + es*100/total + "%");
        System.out.println("Porcentagem de OU: " + ou*100/total + "%");
    }
}