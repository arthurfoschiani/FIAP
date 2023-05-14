import './Modal.css';

export default function Modal({ children, onClose }) {

  return (
    <>
      <div className="modal">
        <div className="modal__content">{children}</div>
        <div className="modal__background" onClick={onClose}></div>
      </div>
    </>
  )
}