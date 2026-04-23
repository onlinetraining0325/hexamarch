import React, {Component, useContext} from 'react';
import { ColorContext } from '../../context/ColorContext';

const ColorTheme = () => {
  const theme = useContext(ColorContext);
  return(
    <div>
      <p>This is Color Theme...</p>
      <p>Color Theme Example</p>
      <button style={{backgroundColor:theme.background,color:theme.text}}>
        Color Demo
      </button> <br/><br/>
      <input type="text" name="firstName" 
        style={{backgroundColor:theme.background,color:theme.text}} />
    </div>
  )
}

export default ColorTheme;