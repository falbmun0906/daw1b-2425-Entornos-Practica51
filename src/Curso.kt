class Curso(val nombre: String,
            val codigo: String,
            private val estudiantes: MutableList<Estudiante>) {

    fun agregarAlumno(estudiante: Estudiante) {
        if (!(estudiante in estudiantes)) {
            estudiantes.add(estudiante)
        } else println("ERROR: Ese alumno ya existe.")
    }

    fun mostrarEstudiantes() {
        println("ALUMNOS DE ${nombre.uppercase()} (COD: $codigo)\n")
        for ((i, estudiante) in estudiantes.withIndex()) {
            println("\tEstudiante #${i + 1}:\n\t\tNombre: ${estudiante.nombre}\n\t\tDNI: ${estudiante.dni}\n")
        }
    }
}