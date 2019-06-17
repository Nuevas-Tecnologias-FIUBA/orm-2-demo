package grailsapp

import grails.rest.*

@Resource(uri='/student')
class Student {

    String name
    String surname
    Integer age
    static belongsTo = Teacher

    static hasMany = [teachers: Teacher]

    static constraints = {
        name blank:false
        surname blank: false
        age nulalble:false
    }
}