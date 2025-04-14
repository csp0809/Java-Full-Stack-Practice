import React from 'react'
import Script from 'next/script'

const contact = () => {
  return (
    <div>
        <script>
            {`alert("welcome to contact page");`}
        </script>
      This is contact
    </div>
  )
}

export default contact

export const metadata = {
    title: "Contact Facebook - Connect with the world",
    description: "This is page for contacting facebook for educational purpose only",
  };