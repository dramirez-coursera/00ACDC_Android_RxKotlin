package retrofit

import model.Elements
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import rx.Observable

interface CourseService {
    companion object {
        val INSTANCE: CourseService by lazy {
            val retrofit = Retrofit.Builder()
                    .baseUrl("https://api.coursera.org/api/")
                    .addConverterFactory(MoshiConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build()

            retrofit.create(CourseService::class.java)
        }
    }

    @GET("courses.v1?limit=100")
    fun getCourses(): Observable<Elements>
}