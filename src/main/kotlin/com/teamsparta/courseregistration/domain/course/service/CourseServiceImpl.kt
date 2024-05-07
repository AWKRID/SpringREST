package com.teamsparta.courseregistration.domain.course.service

import com.teamsparta.courseregistration.domain.course.dto.CourseResponse
import com.teamsparta.courseregistration.domain.course.dto.CreateCourseRequest
import com.teamsparta.courseregistration.domain.course.dto.UpdateCourseRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional


@Service
class CourseServiceImpl: CourseService {
    override fun getAllCourseList(): List<CourseResponse> {
        // TODO: DB에서 모든 course 목록을 조회하여 CourseReponse 목록으로 변환 후 반환
        TODO("Not yet implemented")
    }

    override fun getCourseById(courseId: Long): CourseResponse {
        // TODO: 만약 courseID에 해당하는 Course가 없다면 throw ModelNotFoundException
        // TODO: DB에서 ID기반으로 Course 가져와서 CourseResponse로 변환 후 반환
        TODO("Not yet implemented")
    }
    @Transactional
    override fun createCourse(request: CreateCourseRequest): CourseResponse {
        // TODO: request를 Course로 변환 후 DB에 저장
        TODO("Not yet implemented")
    }

    @Transactional
    override fun updateCourse(courseId: Long, request: UpdateCourseRequest): CourseResponse {
        // TODO: 만약 courseID에 해당하는 Course가 없다면 throw ModelNotFoundException
        // TODO: DB에서 courseID에 해당하는 Course를 가져와서 request기반으로 업데이트 후 DB에 저장, 결과를 CourseResponse로 변환 후 반환
        TODO("Not yet implemented")
    }

    @Transactional
    override fun deleteCourse(courseId: Long) {
        // TODO: 만약 courseID에 해당하는 Course가 없다면 throw ModelNotFoundException
        // TODO: DB에서 courseId에 해당하는 Course 삭제, 연관된 CourseApplication과 Lecture도 모두 삭제
        TODO("Not yet implemented")
    }
}