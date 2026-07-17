import './App.css';
import office from './office.jpg';

function App() {

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: office
    },
    {
      Name: "Regus",
      Rent: 65000,
      Address: "Bangalore",
      Image: office
    },
    {
      Name: "WeWork",
      Rent: 80000,
      Address: "Hyderabad",
      Image: office
    }
  ];

  return (
    <div className="App">

      <h1>Office Space, at Affordable Range</h1>

      {officeList.map((item, index) => (

        <div className="card" key={index}>

          <img
            src={item.Image}
            alt="Office"
            width="250"
            height="180"
          />

          <h2>Name: {item.Name}</h2>

          <h3
            style={{
              color: item.Rent < 60000 ? "red" : "green"
            }}
          >
            Rent: Rs. {item.Rent}
          </h3>

          <h3>Address: {item.Address}</h3>

        </div>

      ))}

    </div>
  );
}

export default App;