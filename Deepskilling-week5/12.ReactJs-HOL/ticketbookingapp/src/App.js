import { useState } from "react";
import "./App.css";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  return (

    <div className="App">

      <h1>Ticket Booking Application</h1>

      {
        isLoggedIn ?

          <button onClick={() => setIsLoggedIn(false)}>
            Logout
          </button>

          :

          <button onClick={() => setIsLoggedIn(true)}>
            Login
          </button>

      }

      <hr />

      {
        isLoggedIn ?

          <UserPage />

          :

          <GuestPage />

      }

    </div>

  );

}

export default App;