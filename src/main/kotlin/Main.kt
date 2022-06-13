
fun main(args: Array<String>) {

    val Bco = Banco("ICBC")

    Bco.abrirCuenta(1, "11111111", 200.0)
    Bco.abrirCuenta(3, "22222222", 300.0)
    Bco.abrirCuenta(4, "11111111", 500.00)
    Bco.abrirCuenta(5, "33333333", 350.0)
    Bco.abrirCuenta(6, "33333333", 5.0)
    Bco.abrirCuenta(7, "44444444", 25.0)
    Bco.abrirCuenta(8, "44444444", 20.0)

    Bco.transferir(1,6, 50.0)
    Bco.transferir(4, 7, 100.0)
    Bco.depositar(8, 50.0)
    Bco.depositar(6, 600.0)
    Bco.retirar(5, 50.0)

    Bco.montoporCuenta()
    Bco.imprimirMontoporDni()
    Bco.totalBanco()
}
