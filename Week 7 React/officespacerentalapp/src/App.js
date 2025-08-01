
import './App.css';

function App() {
  const officeItems = [
    { Name: 'DBS', Rent: 50000, Address: 'Chennai', src: process.env.PUBLIC_URL + '/office.jpeg' },
    { Name: 'Regus', Rent: 70000, Address: 'Bangalore', src: process.env.PUBLIC_URL + '/office.jpeg'},
  ];

  const heading = "Office Space";

  return (
    <div className="App">
      <h2>{heading} , at Affordable Range</h2>
      {
        officeItems.map((item, index) => {
          const rentStyle = {
            color: item.Rent <= 60000 ? 'red' : 'green'
          };

          return (
            <div key={index} style={{ marginBottom: '40px' }}>
              <img src={item.src} alt="Office Space" width="25%" height="25%" />
              <h3><b>Name:</b> {item.Name}</h3>
              <h3 style={rentStyle}><b>Rent:</b> Rs. {item.Rent}</h3>
              <h3><b>Address:</b> {item.Address}</h3>
            </div>
          );
        })
      }
    </div>
  );
}

export default App;
