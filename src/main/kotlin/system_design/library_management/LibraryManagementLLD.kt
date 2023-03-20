//package system_design.library_management
//
//import java.util.*
//
//import kotlin.collections.HashMap
//
//class LibraryManagementLLD {
//
//    var title: String = ""
//    var location: Location? = null
//    var books: List<Book>? = null
//
//    var bookingDetails = HashMap<LibraryMember, List<Booking>>()
//    fun getCheckoutDetailsByUser(member: LibraryMember) {
//
//    }
//
//    fun getCheckoutDetailsByBook(book: Book) {
//
//    }
//
//    fun search(searchQuery: String) {
//
//    }
//
//    fun checkOutBook(booking: Booking, member: LibraryMember) {
//
//    }
//
//    fun reserveCopy(book: Book, member: LibraryMember) {
//
//    }
//
//    fun issueBook(book: Book, member: LibraryMember) {
//
//    }
//}
//
//class Location {
//    var pinCode: Int = 0
//    var street: String = ""
//    var city: String = ""
//    var state: String = ""
//    var country: String = ""
//}
//
//class Booking {
//    var id: Int = 0
//    var book: Book? = null
//    var bookingDate: Date? = null
//}
//
//
//open class Book {
//    var id: Int = 0
//    var title: String = ""
//    var author: List<Author>? = null
//
//}
//
//class BookItem : Book() {
//    var sequence: Int = 0
//    var category: BookCategory? = null
//    var publicationDate: Date? = null
//    var rankInf: RackInfo? = null
//    var bookStatus: BookStatus? = null
//}
//
//enum class BookCategory {
//    SCI_FI, ROMANTIC, DRAMA, FANTASY
//}
//
//enum class BookStatus {
//    ISSUED, AVAILABLE, RESERVED
//}
//
//
//open class Person {
//    var firstName: String = ""
//    var middleName: String = ""
//    var lastName: String = ""
//}
//
//class Author  : Person(){
//   var publishedBooks = List<Book>()
//}
//
//class RackInfo {
//    var id = 0
//    var locationId: String = ""
//}
//
//class LibraryMember {
//
//}
//
//class Librarian {
//
//}