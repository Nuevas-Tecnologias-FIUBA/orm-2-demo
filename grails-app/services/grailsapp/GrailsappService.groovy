package grailsapp

import grails.gorm.transactions.Transactional

import java.lang.RuntimeException

@Transactional
class GrailsappService {
	TeacherService teacherService
	StudentService studentService

    def serviceMethod() {



    }
}
