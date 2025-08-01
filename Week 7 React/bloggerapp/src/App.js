
import CourseDetails from "./components/CourseDetails";
import BookDetails from "./components/BookDetails";
import BlogDetails from "./components/BlogDetails";
import { books, courses, blogs } from "./data";
import "./App.css";

function App() {
  return (
    <div className="container">
      <div className="column mystyle1">
        <h1>Course Details</h1>
        <CourseDetails courses={courses} />
      </div>

      <div className="column st2">
        <h1>Book Details</h1>
        <BookDetails books={books} />
      </div>

      <div className="column v1">
        <h1>Blog Details</h1>
        <BlogDetails blogs={blogs} />
      </div>
    </div>
  );
}

export default App;
