function UserPage() {

    function bookTicket() {
        alert("Ticket Booked Successfully!");
    }

    return (
        <div>

            <h2>Welcome User</h2>

            <p>You are successfully logged in.</p>

            <table border="1" cellPadding="10">
                <thead>
                    <tr>
                        <th>Flight</th>
                        <th>Source</th>
                        <th>Destination</th>
                    </tr>
                </thead>

                <tbody>
                    <tr>
                        <td>AI101</td>
                        <td>Chennai</td>
                        <td>Delhi</td>
                    </tr>

                    <tr>
                        <td>AI205</td>
                        <td>Bangalore</td>
                        <td>Mumbai</td>
                    </tr>
                </tbody>
            </table>

            <br />

            <button onClick={bookTicket}>
                Book Ticket
            </button>

        </div>
    );
}

export default UserPage;