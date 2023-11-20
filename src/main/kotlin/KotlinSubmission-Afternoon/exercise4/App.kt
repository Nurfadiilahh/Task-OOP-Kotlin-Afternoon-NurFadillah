package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

    // Contoh 1: Membagi dua angka
    try {
        val numerator = 10
        val denominator = 2
        val result = numerator / denominator
        println("Hasil pembagian: $result")
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
    }

    // Contoh 2: Mengakses indeks di luar batas pada array
    try {
        val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7)
        val element = numbers[5]
        println("Element ke-5: $element")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Error: ${e.message}")
    }


}

