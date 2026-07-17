import React from "react";

function CourseDetails() {

    const courses = [

        {
            id:101,
            course:"ReactJS",
            duration:"30 Days"
        },

        {
            id:102,
            course:"Angular",
            duration:"45 Days"
        },

        {
            id:103,
            course:"NodeJS",
            duration:"35 Days"
        }

    ];

    return (

        <div>

            <h2>Course Details</h2>

            <table border="1">

                <thead>

                    <tr>

                        <th>ID</th>
                        <th>Course</th>
                        <th>Duration</th>

                    </tr>

                </thead>

                <tbody>

                    {

                        courses.map((course)=>(

                            <tr key={course.id}>

                                <td>{course.id}</td>
                                <td>{course.course}</td>
                                <td>{course.duration}</td>

                            </tr>

                        ))

                    }

                </tbody>

            </table>

        </div>

    );

}

export default CourseDetails;