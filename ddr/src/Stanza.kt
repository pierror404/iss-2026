data class Stanza(val W: Double, val H: Double, val R: Double) { // H e W sono in unità robotiche
	val larghezzaMetri: Double get() = W * R
    val altezzaMetri: Double get() = H * R
    val home: Posizione = Posizione(0, 0)
}