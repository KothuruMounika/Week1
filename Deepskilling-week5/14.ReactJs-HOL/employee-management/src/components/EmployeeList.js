import React from "react";
import EmployeeCard from "./EmployeeCard";

const employees = [
  {
    id: 1,
    name: "Mounika",
    designation: "Frontend Developer"
  },
  {
    id: 2,
    name: "Rahul",
    designation: "Java Developer"
  },
  {
    id: 3,
    name: "Anjali",
    designation: "UI Designer"
  }
];

function EmployeeList() {
  return (
    <div>
      <h2>Employee List</h2>

      {employees.map((emp) => (
        <EmployeeCard
          key={emp.id}
          employee={emp}
        />
      ))}
    </div>
  );
}

export default EmployeeList;