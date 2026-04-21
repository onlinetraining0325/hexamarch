import React, {Component, useState} from 'react';

const Eight = () => {

  const [data, setData] = useState({
    firstNo : 0,
    secondNo : 0,
    result : 0
  })

  const mult = () => {
    setData({
      ...data,
        result: parseInt(data.firstNo) * parseInt(data.secondNo)
    })

  }

  const sub = () => {
    setData({
      ...data,
        result: parseInt(data.firstNo) - parseInt(data.secondNo)
    })

  }

  const sum = () => {
    setData({
      ...data,
        result: parseInt(data.firstNo) + parseInt(data.secondNo)
    })

  }
  const handleChange = event => {
    setData({
            ...data,[event.target.name] : event.target.value  
      })
  }


  return(
    <div>
       <label>First Number :  </label>
        <input type="number" name="firstNo" value={data.firstNo}
          onChange={handleChange}
        /> <br/><br/>
       <label>Second Number :  </label>
       <input type="number" name="secondNo" value={data.secondNo} 
        onChange={handleChange}
       /> <br/><br/>
       <label>Result</label>
       <input type="number" name="result" value={data.result} 
        onChange={handleChange}
       /> <br/><br/>
       <input type="button" value="Sum" onClick={sum} /> 
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       <input type="button" value="Sub" onClick={sub} /> 
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       <input type="button" value="Mult" onClick={mult} />
    </div>
  )

}

export default Eight;