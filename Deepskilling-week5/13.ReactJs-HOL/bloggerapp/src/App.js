import React, { useState } from "react";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import CourseDetails from "./components/CourseDetails";

function App() {

  const [showBook, setShowBook] = useState(true);
  const [showBlog, setShowBlog] = useState(true);
  const [showCourse, setShowCourse] = useState(true);

  return (

    <div className="container">

      <h1>Blogger Application</h1>

      <button onClick={() => setShowBook(!showBook)}>
        Toggle Books
      </button>

      <button onClick={() => setShowBlog(!showBlog)}>
        Toggle Blogs
      </button>

      <button onClick={() => setShowCourse(!showCourse)}>
        Toggle Courses
      </button>

      <hr />

      {/* Conditional Rendering using && */}

      {showBook && <BookDetails />}

      {/* Conditional Rendering using Ternary */}

      {showBlog ? <BlogDetails /> : <h3>Blog Details Hidden</h3>}

      {/* Conditional Rendering using if */}

      {(() => {

        let component;

        if (showCourse) {
          component = <CourseDetails />;
        } else {
          component = <h3>Course Details Hidden</h3>;
        }

        return component;

      })()}

    </div>

  );
}

export default App;