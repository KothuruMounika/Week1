import React from "react";

function BlogDetails() {

    const blogs = [

        {
            id:1,
            title:"React Basics",
            author:"Mounika"
        },

        {
            id:2,
            title:"Understanding JSX",
            author:"Rahul"
        },

        {
            id:3,
            title:"React Hooks",
            author:"Anjali"
        }

    ];

    return (

        <div>

            <h2>Blog Details</h2>

            <ul>

                {

                    blogs.map((blog)=>(

                        <li key={blog.id}>

                            {blog.title} - {blog.author}

                        </li>

                    ))

                }

            </ul>

        </div>

    );

}

export default BlogDetails;