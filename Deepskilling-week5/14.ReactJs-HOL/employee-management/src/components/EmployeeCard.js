import React, { useContext } from "react";
import ThemeContext from "../ThemeContext";

function EmployeeCard({ employee }) {

  const theme = useContext(ThemeContext);

  return (
    <div>

      <h3>{employee.name}</h3>

      <p>{employee.designation}</p>

      <button
        className={theme}
        onClick={() => alert(employee.name)}
      >
        View Details
      </button>

    </div>
  );
}

export default EmployeeCard;