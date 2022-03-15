
//CONCESIONARI DE COTXES

class Concesionari {
    public static void main(String args[]) {
        System.out.println("\n --- VEHICLES ---");
                                                         //AQUI ES POSA EL CONTRUCTOR
        Cotxe vehicle = new Cotxe("4x4", "Nissan", "Patrol GR Y60", 1995, "Cooper STT", "RD28T");
        System.out.println(vehicle.toString());  

        System.out.println();

        Moto vehicle2 = new Moto("Moto", "Yamaha", "857jd", 2000, "Renthal", 1);
        System.out.println(vehicle2.toString()); 

        // vehicle.setPneumatic("Continental");
        // vehicle.printComponentsCotxe();
        // vehicle.setPneumatic("BFGoodrich");
        // System.out.println(vehicle.getPneumatic()); 
    }
}