package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    // Mengisi variabel sesuai dengan ketentuan
    val firstName: String = "Nur"
    val lastName: String = "Fadillah"
    val age: Int = 20
    val isSingle: Boolean = true

    // Menampilkan nilai variabel ke layar
    println("Nama Depan: $firstName")
    println("Nama Belakang: $lastName")
    println("Umur: $age tahun")
    println("Status: ${if (isSingle) "Single" else "Tidak Single"}")
}




/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMembers: List<Any>, session: String): Any {
    // Mencetak nilai parameter menggunakan println
    println("Group ID: $groupId")
    println("Group Members: $groupMembers")
    println("Session: $session")

    // Mengembalikan nilai string kosong (sesuai dengan fungsi yang telah didefinisikan)
    return ""
}


/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    // Buat variable yang berisi daftar anggota grup
    val groupMembers = listOf("Fadillah", "shofia", "Taufiq", "Astriani", "Farida")

    // Akses item yang berisi nama Anda dari variable tersebut
    val myName = groupMembers[2]

    // Jadikan nilai kembalian untuk fungsi myTeam
    return groupMembers
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    // Mengganti array yang tidak memiliki elemen dengan List
    val mentors = listOf("Magy", "Raihan", "Maulana")  // Ganti dengan nama mentor yang sesuai
    val groupMembers = listOf("Fadillah", "Farida", "Shofia")  // Ganti dengan nama anggota grup yang sesuai

    // Menghitung total mentor + jumlah anggota group
    val total = mentors.size + groupMembers.size

    // Mengembalikan nilai total sebagai hasil fungsi
    return total
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("strix", listOf("Farida", "Shofia", "Astriani", "Taufiq"), "Afternoon")


}