package com.teamsparta.courseregistration.domain.course.controller

import com.teamsparta.courseregistration.domain.course.dto.CourseResponse
import com.teamsparta.courseregistration.domain.course.dto.CreateCourseRequest
import com.teamsparta.courseregistration.domain.course.dto.UpdateCourseRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/courses")
@RestController
class CourseController {

    @GetMapping()
    fun getCourses(): ResponseEntity<List<CourseResponse>> {
        TODO()
    }

    @GetMapping("/{courseId}")
    fun getCourse(@PathVariable courseId: Long){
        TODO()
    }
    @PostMapping
    fun createCourse(@RequestBody createCourseRequest: CreateCourseRequest) : ResponseEntity<CourseResponse> {
        TODO()
    }
    @PutMapping("/{courseId}")
    fun updateCourse(@PathVariable courseId: Long, @RequestBody updateCourseRequest: UpdateCourseRequest) : ResponseEntity<CourseResponse> {
        TODO()
    }

    @DeleteMapping("/{courseId}")
    fun deleteCourse(@PathVariable courseId: Long){
        TODO()
    }
}