import React, {Component, useContext} from 'react';
import { FontContext } from '../../context/FontContext';

const FontTheme = () => {
  const theme = useContext(FontContext)
  return(
    <div>
            <p>Example for Font</p>
      <button style={{background:theme.background,color:theme.text,
        fontSize:theme.fontSize,fontFamily:theme.fontFamily
      }}>Font Example</button> <hr/>
      
      <label style={{background:theme.background,color:theme.text,
        fontSize:theme.fontSize,fontFamily:theme.fontFamily
      }}>Demo Data</label>

    </div>
  )

}

export default FontTheme;