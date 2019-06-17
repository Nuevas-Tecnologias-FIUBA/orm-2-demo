package grailsapp

class Teacher {

	String name
    String surname
    Integer age

    static hasMany = [students: Student]

    static mapping = {
		students fetch: 'join'
	}

    static constraints = {
    }
}
