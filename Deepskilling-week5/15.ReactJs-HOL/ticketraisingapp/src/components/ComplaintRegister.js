import React, { useState } from "react";

function ComplaintRegister() {

  const [employeeName, setEmployeeName] = useState("");
  const [complaint, setComplaint] = useState("");

  const handleSubmit = (event) => {

    event.preventDefault();

    const referenceNumber = Math.floor(
      100000 + Math.random() * 900000
    );

    alert(
      "Thanks " +
      employeeName +
      "\nYour Complaint was submitted successfully.\nReference Number: " +
      referenceNumber
    );

    setEmployeeName("");
    setComplaint("");
  };

  return (

    <div className="container">

      <h2>Ticket Raising App</h2>

      <form onSubmit={handleSubmit}>

        <label>Employee Name</label>

        <input
          type="text"
          value={employeeName}
          onChange={(e) => setEmployeeName(e.target.value)}
          required
        />

        <label>Complaint</label>

        <textarea
          rows="5"
          value={complaint}
          onChange={(e) => setComplaint(e.target.value)}
          required
        ></textarea>

        <button type="submit">
          Submit
        </button>

      </form>

    </div>

  );
}

export default ComplaintRegister;