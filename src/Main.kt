fun main() {

    val curso1 = Curso("1º DAW-B","ABC123", mutableListOf())
    val curso2 = Curso("2º ADMINISTRACIÓN-A","DFG456", mutableListOf())
    val estudiante1 = Estudiante("Fran", "29558734-F")
    val estudiante2 = Estudiante("Pablo", "555558733-P")
    val estudiante3 = Estudiante("Inda", "777558733-I")

    estudiante1.inscribirse(curso1)
    estudiante2.inscribirse(curso2)
    estudiante3.inscribirse(curso2)

    curso1.mostrarEstudiantes()
    curso2.mostrarEstudiantes()
}