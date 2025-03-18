package p06.facade;

//Subsistema 2: Pago
class Pago {
 public void procesarPago(String cuenta, double monto) {
     System.out.println("Procesando pago de $" + monto + " desde la cuenta: " + cuenta);
 }
}