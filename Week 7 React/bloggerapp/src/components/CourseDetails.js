

function CourseDetails({ courses }) {
  return (
    <ul>
      {courses.map((course, index) => (
        <div key={index}>
          <h3>{course.name}</h3>
          <p>{course.date}</p>
        </div>
      ))}
    </ul>
  );
}

export default CourseDetails;
