
const ScoreBelow70 = ({ players }) => {
  const players70 = [];
  players.map((item) => {
    if (item.score < 70) {
      players70.push(item);
    }
    return null;
  });

  return (
    <ul>
      {players70.map((item, index) => (
        <li key={index}>Mr. {item.name} {item.score}</li>
      ))}
    </ul>
  );
};

export default ScoreBelow70;
